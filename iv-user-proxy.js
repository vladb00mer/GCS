var myArgs = process.argv.slice(2);

var http = require('http'),
    httpProxy = require('http-proxy');

//
// Create a proxy server with custom application logic
//
var proxy = httpProxy.createProxyServer({});

// To modify the proxy connection before data is sent, you can listen
// for the 'proxyReq' event. When the event is fired, you will receive
// the following arguments:
// (http.ClientRequest proxyReq, http.IncomingMessage req,
//  http.ServerResponse res, Object options). This mechanism is useful when
// you need to modify the proxy request before the proxy connection
// is made to the target.
//

const defaultTargetPort = 8080;
var targetPort = myArgs[0] || defaultTargetPort;
const targetUrl = 'http://127.0.0.1:' + targetPort;

proxy.on('proxyReq', function(proxyReq, req, res, options) {
    proxyReq.setHeader('iv-user', myArgs[1]);
});

var server = http.createServer(function(req, res) {
    // You can define here your custom logic to handle the request
    // and then proxy the request.
        proxy.web(req, res, {
            target: targetUrl
        });

        proxy.on('error', function(err, req, res) {
            if (err) {
                console.log(err);
            }
            res.writeHead(500);
            res.end('Ooops, something went wrong...');
        });
});

console.log("proxy target url: " + targetUrl);
console.log("proxy injecting user: " + myArgs[1]);
console.log("proxy listening on port " + myArgs[2]);
server.listen(myArgs[2]);



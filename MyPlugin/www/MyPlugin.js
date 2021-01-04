var exec = require('cordova/exec');

exports.plus = function (args, success, error) {
    exec(success, error, 'MyPlugin', 'Plus', [args]);
};

exports.minus = function (args, success, error) {
    exec(success, error, 'MyPlugin', 'Minus', [args]);
};

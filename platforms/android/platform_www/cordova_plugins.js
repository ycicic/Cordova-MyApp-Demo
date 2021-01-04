cordova.define('cordova/plugin_list', function(require, exports, module) {
  module.exports = [
    {
      "id": "SimplePlugin.MyPlugin",
      "file": "plugins/SimplePlugin/www/MyPlugin.js",
      "pluginId": "SimplePlugin",
      "clobbers": [
        "cordova.plugins.MyPlugin"
      ]
    }
  ];
  module.exports.metadata = {
    "cordova-plugin-whitelist": "1.3.4",
    "SimplePlugin": "1.0.0"
  };
});
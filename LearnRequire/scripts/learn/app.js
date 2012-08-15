// Filename: app.js
define([  
  'backbone',      
  'learn/testObject', 
  'learn/print'
], function(Backbone,testObject,print){
	
  var initialize = function(){
    // Call the module you want to init
	testObject.setId(200);
	testObject.setName("TempNamedObject");
	testObject.printObject();
	
	var test = {age:100,address:"Sunnyvale11"};
	testObject.printThisObject(test);
	
	Person = Backbone.Model.extend({
        initialize: function(){
            alert("Welcome to this world");
        }
    });
    
    var person = new Person;	
	
  }

  return {
    initialize: initialize
  };
});
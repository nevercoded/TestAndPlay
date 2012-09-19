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
		defaults: {
            name: 'Fetus',
            age: 0          
        },
		initialize: function(){
            console.log("INIT person");
            this.bind("change:name", function(){
                var name = this.get("name"); // 'Stewie Griffin'
                print.output("Name changes to "+ name);
            });
            
        },
        show: function(){
        	print.output(JSON.stringify(this));
        }
        
        
    });
    
    var person = new Person;
    person.set({name:"Sushanth", age:"30"});
    person.set({name: "Stewie Griffin"});
    person.show();
	
  }

  return {
    initialize: initialize
  };
});
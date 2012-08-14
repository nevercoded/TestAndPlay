define(['learn/print'],
		function   (printer) {
			return{
				name : "ObjectName",
				id   : 100,
				
				getName: function(){return name;},
				setName: function(n){name = n;},
				getId  : function(){return id;},
				setId  : function(i){id = i;},				
				
				printObject: function(){
					var message = JSON.stringify(this);
					printer.output(message);
				},
					
				printThisObject: function(object){
					printer.output(JSON.stringify(object));
				}
			};
		}
);
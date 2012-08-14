define(['learn/print'],
		function   (printer) {
			return{
				type: "sedan",
				model: "Nissan",
				color: "Black",    	
				//getName: function(){return "Altima"}//,
				print: function(message)
				{printer.output(message);}
			};
		}
);
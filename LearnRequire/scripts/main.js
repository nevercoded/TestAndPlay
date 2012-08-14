requirejs.config({
    //By default load any module IDs from js/lib
    baseUrl: 'scripts/lib',
    paths: {
        // Load all jars from learn folder
    	learn : "../learn"
    }    
});

// Start the main app logic.
requirejs(['learn/testObject', 'learn/print'],
function   (testObject, printer) {
	testObject.setId(200);
	testObject.setName("TempNamedObject");
	testObject.printObject();
	
	var test = {age:100,address:"Sunnyvale"};
	testObject.printThisObject(test);
   
});
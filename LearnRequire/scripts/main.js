requirejs.config({
    //By default load any module IDs from js/lib
    baseUrl: 'scripts/lib',
    paths: {
        // Load all jars from learn folder
    	learn : "../learn",
    	jquery : "./jquery/jquery",
    	underscore : "./underscore/Underscore",
    	backbone : "./backbone/Backbone"    },  
	shim: {
	    'underscore': {
	      deps: ['jquery'], //dependencies
	      exports: '_' //the exported symbol
	    },
	    backbone: {
	      deps: ['underscore', 'jquery'],
	      exports: 'Backbone'
	    }
	  }
});

// Start the main app logic.
requirejs(['jquery','underscore','backbone','learn/app'],
function ($,_,Backbone,App) {	
	App.initialize();		
   
});
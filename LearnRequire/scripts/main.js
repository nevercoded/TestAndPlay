requirejs.config({
    //By default load any module IDs from js/lib
    baseUrl: 'scripts/lib'    
});

// Start the main app logic.
requirejs(['jquery'],
function   ($,        canvas,   sub) {
    //jQuery, canvas and the app/sub module are all
    //loaded and can be used here now.
});
requirejs.config({
    //By default load any module IDs from js/lib
    baseUrl: 'scripts/lib',
    paths: {
        learn : "../learn"
    }    
});

// Start the main app logic.
requirejs(['learn/car', 'learn/print'],
function   (car, printer) {
   document.write(JSON.stringify(car));
   car.print("Printing through car");
   printer.output("Print this shit");
});
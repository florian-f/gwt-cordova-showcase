mvn clean gwt:compile war:exploded;
rm -r app/www/*;
#rm target/gwtcordova-showcase-0.1-SNAPSHOT/gwtcordovashowcase/bower_components/web-animations-js/web-animations.min.js.gz;
cp -r target/gwtcordova-showcase-0.1-SNAPSHOT/* app/www/;

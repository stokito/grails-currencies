class CurrenciesGrailsPlugin {
	String version = '1.5-SNAPSHOT'
    String dependsOn = [:]
    String grailsVersion = '2.0.0 > *'
    String author = 'Ricardo J. Méndez'
    String authorEmail = 'ricardo@arquetipos.co.cr'
    String title = 'Currency and exchange rate plugin for grails'
    String description = '''\
Allows easy storage of currencies and exchange rates across them.  Provides
a Money helper class that is used for converting between currencies at the
exchange rate on a certain date (the current date is used by default).

It's recommended you use the money amounts embedded.
'''
}

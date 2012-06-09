Example emphasizing pragmatic approach to testing. Code in
`ExceptionMailerService.groovy` is so declarative that it makes no sense to test
it.

`ExceptionMailerService.groovy` can't be run independently but should be
embedded in a [Grails](http://grails.org) application using [mail
plugin](http://grails.org/plugin/mail).

class ExceptionMailerService {

    def mailService

    void mail(String description) {
        mailService.sendMail {
          to      'admins@acme.com', 'developers@acme.com'
          from    'sales.app@acme.com'
          subject 'Unrecognized exception'
          body    description
        }
    }

}

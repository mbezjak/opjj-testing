package opjj

import spock.lang.Specification
import spock.lang.Unroll

class ListUtilSpec extends Specification {

    @Unroll
    def "reverse of #list should be #reversed"() {
        expect:
        reversed == ListUtil.reverse(list)

        where:
        list                  | reversed
        []                    | []
        [1]                   | [1]
        ['foo']               | ['foo']
        [1, 2, 3, 4, 5]       | [5, 4, 3, 2, 1]
        ['foo', 'bar', 'baz'] | ['baz', 'bar', 'foo']
    }

}

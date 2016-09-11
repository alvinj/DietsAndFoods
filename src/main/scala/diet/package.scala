package object diet {

    implicit class QHelper(val sc: StringContext) {
        def Q(args: Any*): Seq[String] = {
            val strings = sc.parts.iterator
            val expressions = args.iterator
            var buf = new StringBuffer(strings.next)
            while (strings.hasNext) {
                buf append expressions.next
                buf append strings.next
            }

            buf.toString.split("\n")
                .toSeq
                .map(_.trim)
                .filter(_ != "")
        }
    }

}
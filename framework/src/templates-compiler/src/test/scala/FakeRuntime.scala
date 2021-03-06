// TODO Get rid of this file which just demonstrates how harmful copy-pasting is.

package play.api.templates {

  trait Template0[Result] { def render(): Result }
  trait Template1[A, Result] { def render(a: A): Result }
  trait Template2[A, B, Result] { def render(a: A, b: B): Result }
  trait Template3[A, B, C, Result] { def render(a: A, b: B, c: C): Result }
  trait Template4[A, B, C, D, Result] { def render(a: A, b: B, c: C, d: D): Result }
  trait Template5[A, B, C, D, E, Result] { def render(a: A, b: B, c: C, d: D, e: E): Result }
  trait Template6[A, B, C, D, E, F, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F): Result }
  trait Template7[A, B, C, D, E, F, G, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F, g: G): Result }
  trait Template8[A, B, C, D, E, F, G, H, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H): Result }
  trait Template9[A, B, C, D, E, F, G, H, I, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I): Result }
  trait Template10[A, B, C, D, E, F, G, H, I, J, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J): Result }
  trait Template11[A, B, C, D, E, F, G, H, I, J, K, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K): Result }
  trait Template12[A, B, C, D, E, F, G, H, I, J, K, L, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L): Result }
  trait Template13[A, B, C, D, E, F, G, H, I, J, K, L, M, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M): Result }
  trait Template14[A, B, C, D, E, F, G, H, I, J, K, L, M, N, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N): Result }
  trait Template15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O): Result }
  trait Template16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P): Result }
  trait Template17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q): Result }
  trait Template18[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R): Result }
  trait Template19[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S): Result }
  trait Template20[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T): Result }
  trait Template21[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U): Result }
  trait Template22[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, Result] { def render(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U, v: V): Result }

}

package play.templates {

  trait Appendable[T] {
    def +(other: T): T
    override def equals(x: Any): Boolean = super.equals(x)
    override def hashCode() = super.hashCode()
  }

  trait Format[T <: Appendable[T]] {
    type Appendable = T
    def raw(text: String): T
    def escape(text: String): T
  }

  case class BaseScalaTemplate[T <: Appendable[T], F <: Format[T]](format: F) {

    def _display_(o: Any)(implicit m: Manifest[T]): T = {
      o match {
        case escaped if escaped != null && escaped.getClass == m.erasure => escaped.asInstanceOf[T]
        case () => format.raw("")
        case None => format.raw("")
        case Some(v) => _display_(v)
        case xml: scala.xml.NodeSeq => format.raw(xml.toString)
        case escapeds: TraversableOnce[_] => escapeds.foldLeft(format.raw(""))(_ + _display_(_))
        case escapeds: Array[_] => escapeds.foldLeft(format.raw(""))(_ + _display_(_))
        case string: String => format.escape(string)
        case v if v != null => _display_(v.toString)
        case _ => format.raw("")
      }
    }

  }

  /* ------ */

  object TemplateMagic {

    // --- UTILS

    def defining[T](t: T)(handler: T => Any) = {
      handler(t)
    }

    def using[T](t: T) = t

    // --- IF

    implicit def iterableToBoolean(x: Iterable[_]) = x != null && !x.isEmpty
    implicit def optionToBoolean(x: Option[_]) = x != null && x.isDefined
    implicit def stringToBoolean(x: String) = x != null && !x.isEmpty

    // --- JAVA

    implicit def javaCollectionToScala[T](x: java.lang.Iterable[T]) = {
      import scala.collection.JavaConverters._
      x.asScala
    }

    // --- DEFAULT

    case class Default(default: Any) {
      def ?:(x: Any) = x match {
        case "" => default
        case Nil => default
        case false => default
        case 0 => default
        case None => default
        case _ => x
      }
    }

    implicit def anyToDefault(x: Any) = Default(x)

    // --- DATE

    class RichDate(date: java.util.Date) {

      def format(pattern: String) = {
        new java.text.SimpleDateFormat(pattern).format(date)
      }

    }

    implicit def richDate(date: java.util.Date) = new RichDate(date)

    // --- STRING

    class RichString(string: String) {

      def when(predicate: => Boolean) = {
        predicate match {
          case true => string
          case false => ""
        }
      }

    }

    implicit def richString(string: String) = new RichString(string)

  }

}

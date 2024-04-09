package D0402;

public class F {
	void method() {
		class G {
			G() {
			}

			int field1;
			static int field2;

			void method1() {
				System.out.println("class E - method() - class F - method1()");
			}
		}
		G g = new G();
		g.field1 = 7;
		System.out.println("g.field1 : " + g.field1);
		g.method1();

	}
}

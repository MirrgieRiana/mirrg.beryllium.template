package mirrg.beryllium.template;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * インスタンスを生成せず静的メンバを呼び出す為のクラスは末尾にUtilをつけます。
 */
public class TemplateUtil
{

	public static final String TEMPLATE = "Template";

	public static String template(String string)
	{
		System.out.println(string);
		return "Template";
	}

	/**
	 * @param inter
	 *            フィールドや変数の名前にはインターフェースの先頭のiを付けません。
	 */
	public static String template(IInter inter)
	{
		return template(inter.method("a"));
	}

	/**
	 * @param sInter
	 *            Supplierなどの一部の型には短いプレフィクスを付けます。
	 */
	public static String template(Supplier<IInter> sInter)
	{
		return template(sInter.get());
	}

	/**
	 * @param osInter
	 *            クラスが入れ子構造になっている場合、中間のプレフィクス部分は小文字で表記します。
	 */
	public static String template(Optional<Supplier<IInter>> osInter)
	{
		Supplier<IInter> sInter = osInter.get();
		IInter inter = sInter.get();
		return template(inter);
	}

	/**
	 * 例外クラスの変数やラムダ式の引数は1文字に短縮することができます。
	 *
	 * @param fInter
	 *            関数の引数部分のプレフィクスは省略します。
	 */
	public static String template(Function<UnaryOperator<String>, IInter> fInter)
	{
		try {
			return template(fInter.apply(s -> s + s));
		} catch (Exception e) {
			return "";
		}
	}

}

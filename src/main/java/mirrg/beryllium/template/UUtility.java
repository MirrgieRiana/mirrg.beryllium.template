package mirrg.beryllium.template;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * ユーティリティクラスはほぼstaticメンバだけで構成されます。
 * 先頭にUtilitiesを表すUを付けます。
 */
public class UUtility
{

	public static final String TEMPLATE = "Template";

	public static String convertAndPrint(String string)
	{
		System.out.println(string);
		return string + string;
	}

	/**
	 * @param material
	 *            フィールドや変数の名前にはインターフェースの先頭のiを付けません。
	 */
	public static String convertAndPrint(IMaterial material)
	{
		return convertAndPrint(material.getLocalizedName("ja_JP"));
	}

	/**
	 * @param sMaterial
	 *            Supplierなどの一部の型には短いプレフィクスを付けます。
	 */
	public static String convertAndPrint(Supplier<IMaterial> sMaterial)
	{
		return convertAndPrint(sMaterial.get());
	}

	/**
	 * @param osMaterial
	 *            クラスが入れ子構造になっている場合、中間のプレフィクス部分は小文字で表記します。
	 */
	public static String convertAndPrint(Optional<Supplier<IMaterial>> osMaterial)
	{
		Supplier<IMaterial> sMaterial = osMaterial.get();
		IMaterial material = sMaterial.get();
		return convertAndPrint(material);
	}

	/**
	 * 例外クラスの変数やラムダ式の引数は1文字に短縮することができます。
	 *
	 * @param fMaterial
	 *            関数の引数部分のプレフィクスは省略します。
	 */
	public static String convertAndPrint(Function<UnaryOperator<String>, IMaterial> fMaterial)
	{
		try {
			return convertAndPrint(fMaterial.apply(s -> s + s));
		} catch (Exception e) {
			return "";
		}
	}

}

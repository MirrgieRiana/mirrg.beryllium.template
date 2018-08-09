package mirrg.beryllium.template.core;

import mirrg.beryllium.template.IMaterial;

/**
 * インターフェースを実装する際のベースとなるクラスにはBaseを付けます。
 */
public abstract class MaterialBase implements IMaterial
{

	/**
	 * それだけで一つの形状であるとみなせるものは通常の語順で書きます。
	 */
	@Override
	public String getLocalizedName(String location)
	{
		return getNameEnglish();
	}

	/**
	 * 上位の分類を左に、下位の分類を右に書きます。
	 * 多くの場合、abstractクラスから呼び出されるためのabstractメソッドはprotectedになります。
	 */
	protected abstract String getNameEnglish();

}

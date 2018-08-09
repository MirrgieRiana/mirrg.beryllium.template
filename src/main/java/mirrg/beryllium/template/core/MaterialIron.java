package mirrg.beryllium.template.core;

import java.io.File;

/**
 * インターフェースの実装は実装の方式を右側に、インターフェース名を左側に書きます。
 */
public class MaterialIron extends MaterialBase
{

	/**
	 * 変数の用途は型名の右側に書きます。
	 */
	public File fileIcon;

	/**
	 * 型名と形状名は異なる場合があります。
	 */
	public String nameEnglish = "Iron";

	@Override
	protected String getNameEnglish()
	{
		return nameEnglish;
	}

}

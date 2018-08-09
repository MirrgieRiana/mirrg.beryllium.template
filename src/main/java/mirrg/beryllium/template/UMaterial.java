package mirrg.beryllium.template;

import mirrg.beryllium.template.core.MaterialIron;

public class UMaterial
{

	/**
	 * ファクトリメソッドは種類の名前をそのまま付けてもかまいません。
	 */
	public static IMaterial iron()
	{
		return new MaterialIron();
	}

}

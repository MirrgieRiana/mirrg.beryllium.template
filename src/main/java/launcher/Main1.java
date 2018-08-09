package launcher;

import mirrg.beryllium.template.UMaterial;
import mirrg.beryllium.template.UUtility;

/**
 * メインクラスはMainもしくはMainで始まるクラス名です。
 * 基本的に成果物名をもつパッケージにあるクラスだけで操作ができるように呼び出し側を作ります。
 */
public class Main1
{

	public static void main(String[] args)
	{
		System.err.println(UUtility.convertAndPrint(UMaterial.iron()));
	}

}

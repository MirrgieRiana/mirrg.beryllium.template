package mirrg.beryllium.template;

import java.io.File;
import java.io.PrintStream;

/**
 * インターフェースの実装は実装の方式を右側に、インターフェース名を左側に書きます。
 */
public class InterImplement extends InterBase
{

	@Override
	protected String methodImpl()
	{
		return "Interface";
	}

	/**
	 * 変数の用途は型名の右側に書きます。
	 */
	public File fileSrc;

	/**
	 * 入出力ストリームはin/outと表記できます。
	 */
	public PrintStream inSrc;

}

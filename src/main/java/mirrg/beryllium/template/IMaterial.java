package mirrg.beryllium.template;

/**
 * インターフェースには先頭にIを付けます。
 */
public interface IMaterial
{

	/**
	 * paramやreturnのドキュメントは必ずしも書く必要はありません。
	 */
	public String getLocalizedName(String location);

}

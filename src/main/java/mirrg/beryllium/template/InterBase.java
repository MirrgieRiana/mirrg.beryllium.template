package mirrg.beryllium.template;

/**
 * インターフェースを実装する際のベースとなるクラスにはBaseを付けます。
 */
public abstract class InterBase implements IInter
{

	@Override
	public String method(String arg)
	{
		return methodImpl();
	}

	protected abstract String methodImpl();

}

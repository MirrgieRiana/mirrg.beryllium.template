package mirrg.beryllium.template;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * テストクラスはTestで始めます。
 * パッケージはテスト対象に合わせます。
 */
public class Test1
{

	@Test
	public void test_success()
	{
		assertEquals(1, 1);
	}

	@Test
	public void test_fail()
	{
		fail();
	}

}

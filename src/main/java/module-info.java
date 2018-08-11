module mirrg.beryllium.template
{
	exports mirrg.beryllium.template; // 主に使ってほしいもの
	exports mirrg.beryllium.template.core; // 普段は使わないがオプションで触らせたいもの
	// exports mirrg.beryllium.template.impl; // 隠蔽したいパッケージ

	requires static org.junit.jupiter.api;
}

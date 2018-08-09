# mirrg.beryllium.template

## 更新履歴

### 0.1.0

- java 10に移行

マイグレーション

- Gradle Wrapper 4.9の取得
- EclipseでGradle(STS)ネイチャーを除去
- EclipseでBuildshipネイチャーを追加

build.gradle変更点

- コメントの追加と記述順序の変更
- wrapperのバージョンが2.0から4.9に
- 依存性のcompileがimplementationに
- ソースレベルが1.8から10に
- Java10への移行は破壊的なのでバージョンは1番目の番号を上げる

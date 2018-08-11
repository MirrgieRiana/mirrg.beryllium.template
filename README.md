# mirrg.beryllium.template

## 更新履歴

### 0.1.0

- java 10に移行

マイグレーション

- Gradle Wrapper 4.9の取得
- Eclipseネイチャーの変更
    - EclipseでGradle(STS)ネイチャーを除去
    - EclipseでBuildshipネイチャーを追加
- build.gradleの変更
    - コメントの追加と記述順序の変更
    - wrapperのバージョンが2.0から4.9に
    - 依存性のcompileがimplementationに
    - ソースレベルが1.8から10に
    - Java10への移行は破壊的なのでバージョンは1番目の番号を上げる

### 0.2.0

- Jigsaw対応

マイグレーション

- .classpathの追加
    - .gitignoreから.classpathが削除された
    - Eclipseで古い.classpathが悪さをする場合あり
- テストをJUnit5用に修正
    - EclipseでJUnit5テストをしようとするとエラーになるのでJUnit5を指定する
- 適宜module-info.javaを作成
- build.gradleの変更
    - 冒頭のプラグイン部分を変更
    - 依存性をJUnit5に変更
    - Jigsaw対応のための記述を下部に追記
    - mavenRootDirに関する3か所の変更点

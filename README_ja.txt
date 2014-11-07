
# ========================================================================================
#                                                                                 Overview
#                                                                                 ========
SpringBoot と DBFlute のコラボレーション Example です。

ソースコード上のコメントに #dbflute というタグが埋め込まれています箇所が、
SpringBoot と DBFlute が連携するためのポイントです。grepして探してみてください。

また、できる限りシンプルな構成にしていますが、ログだけは譲れないので、 
SVFlute の ServletFilter と Interceptor を入れています。


# ========================================================================================
#                                                                              Environment
#                                                                              ===========
# ----------------------------------------------------------
#                                         Compile & Database
#                                         ------------------
依存ライブラリは、Mavenで管理しています。
Eclipseであれば、M2Eが入っていれば clone するだけでコンパイルが走るはずです。
IntelliJ IDEAであれば、pom.xmlから Maven を有効にしてください。

データベースは、H2 Database を組み込みで利用しますので準備は不要です。
(src/main/resources/database配下)

# ----------------------------------------------------------
#                                           Boot Application
#                                           ----------------
org.docksidestage.springboot.app.application.ExampleApplication
の main() メソッドを実行すると、Tomcatが 8080 ポートで起動します。

ブラウザで以下のURLにアクセス：

http://localhost:8080/member/

# ----------------------------------------------------------
#                                          Package Structure
#                                          -----------------
org.docksidestage.springboot が、このプロジェクトのルートパッケージと考えてください。
アプリケーションのプログラムが app パッケージ配下にあり、ここは ComponentScan 対象です。
自動生成されたDBFluteのクラスは、dbfluteパッケージ配下にあります。

※一緒にしていないのは、自動生成されたクラスが ComponentScan されると起動が遅くならないだろうか？
と、ちょっとだけ心配になったからです。問題なければ一緒にしてもいいかもしれません。
(すると、ExampleApplicationにて、JavaConfigの @Import が不要になるかも!?)
ですが、とりあえずScan対象と対象でないものを管理できるようなパッケージ構成としています。

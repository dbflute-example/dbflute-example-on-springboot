
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

データベースは、H2 Database を組み込みで利用します。
cloneした後、一回だけ ReplaceSchema タスクを実行してスキーマを作成してください。
DBFluteクライアント(dbflute_maihamadb)配下の manage.bat(sh) を叩き、replace-schema (0) を選択して実行。

# ----------------------------------------------------------
#                                           Boot Application
#                                           ----------------
org.docksidestage.springboot.app.application.ExampleApplication
の main() メソッドを実行すると、Tomcatが 8080 ポートで起動します。

ブラウザで以下のURLにアクセス：

http://localhost:8080/member/

Eclipseであれば、ExampleApplicationクラスで右クリック Run As - Java Application

# ----------------------------------------------------------
#                                          Package Structure
#                                          -----------------
org.docksidestage が、このプロジェクトのルートパッケージと考えてください。
アプリケーションのプログラムが app パッケージ配下にあり、ここは ComponentScan 対象です。
自動生成されたDBFluteのクラスは、dbfluteパッケージ配下にあります。

一緒にしていないのは「自動生成されたクラスが ComponentScan されると起動が遅くならないだろうか？」
と、ちょっとだけ心配になったからです。問題なければ一緒にしてもいいかもしれません。
(すると、ExampleApplicationにて、JavaConfigの @Import が不要になるかも!?)
ですが、とりあえずScan対象と対象でないものを管理できるようなパッケージ構成としています。

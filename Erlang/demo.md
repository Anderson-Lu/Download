###### 1 Erlang是一种函数式编程语言，对多核并发编程提供了有效的支持。
###### 2 Erlang中没有赋值操作符，对于变量的初始化相当于Java中的const操作符。
```erlang
1> X=123
123
2> X=999
**exception error: no match of right hand side value 999**
```
###### 3 Erlang变量以大写字母开头，小写字母开头的则是符号常量，成为原子。
###### 4 函数式编程中变量不能改变，而在命令式语言中却可以，这是一个很明显的区别。
###### 5 在shell中编译
- 进入到文件所在的目录，启动Erlang shell，执行以下命令
```erlang
1> c(method)
```
- 启动Erlang shell,执行以下命令
```erlang
$ erlc hello.erl
$ erl -noshell -s hello start -s init stop
```
###### 6 Erlang支持大数运算
###### 7 Erlang没有可变状态，没有共享内存，也没有锁，这让程序并发变得简单
###### 8 原子，一个原子的值就是他本身
```erlang
1> hello.
hello
```
###### 9 元组(tuple)相当于我们熟悉的结构体
```erlang
1> Person = {person,{name,joe},{height,1.82},{footsize,42},{eyecolor,brown}}
```
###### 10 访问元组中的属性
```erlang
1> Person = {1,2,3,4}.
{1,2,3,4}
2> {X1,X2,X3,X4} = Person.
{1,2,3,4}
3> X1.
1
4> X2.
2
5> X3.
3
6> X4.
4
```
###### 11 匿名变量 _
符号_被称为匿名变量，与正规变量不同，同一模式中的多个_不必绑定相同的值
###### 12 列表，相当于数组，列表中的第一个列称为表头，其余的称为表尾
###### 13 列表的定义
```erlang
1> ThingsToBuy =[{watch,1},{food,2},{milk,3}].
[{watch,1},{food,2},{milk,3}]
2> ThingsToBuyOne = [{apple,1}|ThingsToBuy].
[{apple,1},{watch,1},{food,2},{milk,3}]
```
###### 14 访问列表
```erlang
1> ThingsToBuy =[{watch,1},{food,2},{milk,3}].
[{watch,1},{food,2},{milk,3}]
2> [Head|Tail] = ThingsToBuy.
[{watch,1},{food,2},{milk,3}]
3> Head.
{watch,1}
4> Tail.
[{food,2},{milk,3}]
5> {XX1,_} = Head.
{watch,1}
6> XX1.
watch
```
###### 15 字符串
```erlang
1>Name = "Hello world".
"Hello world"
```
###### 16 Erlang的变量访问的过程都是一个模式匹配
###### 17 清除绑定：fn()
###### 18 模块（module）是存放代码的地方
###### 19 模块定义：
```erlang
-module(fileName).
-export([methodName/argsNumber]).
```
- 从模块中导出的方法可以在模块外部被调用，未被导出的则只能在模块内部调用




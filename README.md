# AndroidAptDemo
仿照Butterknife，在安卓项目中使用apt自动生成代码的Demo

依赖的三方框架：
```
// 省去自己创建META-INF的麻烦，直接一个AutoService注解就可以
implementation 'com.google.auto.service:auto-service:1.0-rc2'
// 一个生成Java文件的框架，里面提供了各种写方法和写类等的简单写法。
implementation 'com.squareup:javapoet:1.10.0'
```

引导页：
欢迎页面: SplashActivity(主页面)
从Preference里面取出isFirstRun是true还是false，
如果是true：调转到GuideActivity，如果是false，调转到MainActivity

导航页面：GuideActivity
当用户点击“开启微博”记录用户已经浏览过导航页面了，
在Preference设置一个标志：isFirstRun = false.
ViewPager:一个控件
Adapter:数据源


应用主页面：MainActivity
展示应用的主要内容。

Tween Animation 变换动画
Frame Animation 帧动画
Layout Animation布局动画
Property Animation属性动画

Tween Animation 变换动画
Duratoin:动画持续的时间
fillAfter:true,动画结束之后会定位到结束位置
fillBefore:true,动画结束之后会定位到开始位置
interceptor:动画插入器（加速，减速的效果）
repeatCount:动画重复次数
repeatMode:顺序重复/倒叙重复

ScaleAnimation(缩放动画)
fromXScale,toXScale 分别是起始和结束x坐标上的伸缩尺寸.
fromYScale,toYScale 分别是起始和结束y坐标上的伸缩尺寸.
pivotX,pivotY分别为旋转动画相对于x，y的坐标开始位置

AlphaAnimation(透明度动画)
fromAlpha:起始透明度
toAlpha:动画终止时候透明度

RotateAnimation(旋转动画)
fromDegree:起始角度
toDegree:终止角度
pivotX,pivotY分别为旋转动画相对于x，y的坐标开始位置





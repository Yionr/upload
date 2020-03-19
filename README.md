# 使用SpringMVC制作的作业收集系统

> 由于在线收集作业的过程中,很多同学不按照格式给学委提交作业,导致学委整理十分不方便,特此做了一个小小小小小项目(??

# 功能
1. 同学通过网页提交作业,如果作业的格式和预定义的不符合(预定义的是"班级学号+姓名",比如'26张三.docx'),则提示手动输入班级学号+姓名,由JavaScript帮忙修改

2. 提交完成之后所有文件在服务器项目目录WEB-INF/homeWork下

- 用户在提交完成之后,首页上会将对应用户点亮,表明服务器已经存在文件了

- 能够拒绝提交文件夹

- 能够拒绝提交同名文件

*还不知道怎么写下载,暂时就不学了,手动去WinSCP提取就行了*



# 部署方法
IDEA配置好tomcat,启动就行了吧...

# 自定义

`Upload.js` 

- 修改提交格式:把里面的正则修改一下即可

- 添加上交文件名白名单(例外格式): 我里面本来就有,查找代码里面2016的位置

暂时就这么多把..以后不够用了再更新,不足之处太多了,滚去学习(wan)去了

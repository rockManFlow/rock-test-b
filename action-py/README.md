## 生成依赖文件
 0. 在控制台上执行命令，会在根目录下生成requirements.txt依赖文件
    pip freeze > requirements.txt(这个是项目中需要额外下载的依赖文件目录)
## 方式1：python项目直接部署Linux步骤
 1. 服务器上安装配置好python相关环境
 2. 压缩项目源码为zip包，使用xshell+xftp方式上传到服务器
 3. 服务器上解压缩包，cd进项目根目录，执行以下命令安装依赖，执行命令可以看到正在下载文件中的各个依赖，需要一定时间
    pip install -i http://pypi.douban.com/simple/ --trusted-host pypi.douban.com -r requirements.txt
 4. 运行项目启动文件，执行以下命令，执行项目入口文件
    python xxx.py

## 方式2：部署到docker中
  0. 系统中安装docker环境
  1. 创建Dockerfile
    docker创建镜像有三种方式，分别是基于已有容器创建、基于本地模板创建、dockerfile创建。
    在项目根目录创建Dockerfile，编写执行脚本。

  2. 上传压缩项目到目标服务器并解压
  3. 生成镜像
    cd进项目根目录，app.py启动文件需要同Dockerfile放置在同一目录下，执行以下命令生成镜像，
    注意命令后的 ‘.’ 符号指的是在当前目录下执行创建，不要遗漏了该符号。
    创建会去执行下载基础镜像和各个依赖，需要等待一定时间。
    docker build -t 镜像名称 .
  4. 启动容器
    在我的项目中启动的端口是5002，在启动容器时候把该端口映射到9001，这样我们就可以通过该端口访问项目了
    docker run --name 容器名称 -d -p 9001:5002 镜像名称
  5. 进行容器或镜像其他的命令操作

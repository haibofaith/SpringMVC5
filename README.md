# SpringMVC5
参数传递

1.乱码问题如何解决？filter或者使用配置

2.如何传递参数？

1）第一种参数传递方式HttpServletRequest request来获取数据

	@Controller
	@RequestMapping("/user")
	public class UserController {
	//	如何传递参数
	@RequestMapping(value="/add.do")
	public String add(HttpServletRequest request){
		String userNum = request.getParameter("userNum");
		String passWord = request.getParameter("passWord");
		System.out.println("userNum:"+userNum+"passWord:"+passWord);
		return "useradd";
	}
	}

2）	参数对应(优点，类型可自动转换，例如将string参数转换成integer)

	@Controller
	@RequestMapping("/user")
	public class UserController {
	//	如何传递参数
	@RequestMapping(value="/add.do")
	public String add(String userNum,String passWord){
		System.out.println("userNum:"+userNum+"passWord:"+passWord);
		return "useradd";
	}
	}
	
参数对应进阶(参数可设置别名)
	
	<body>
	<h1>用户信息添加</h1>
	<form action="user/add.do" method="post">
	账号：<input type="text" name="userName">
	密码：<input type="text" name="passWord">
	<input type="submit" value="提交">
	</form>
	</body>
	
	@RequestMapping(value="/add.do")
	public String add(@RequestParam(value="userName")String userNum,String passWord){
		System.out.println("userNum:"+userNum+"passWord:"+passWord);
		return "useradd";
	}

3）通过对象

新建对象UserInfo
	
	public class UserInfo {
	private String userId;
	private String userName;
	private String passWord;
	...
	}

对应参数：userInfo 对应关系必须一致。
	
	<body>
	<h1>用户信息添加</h1>
	<form action="user/add.do" method="post">
	编号：<input type="text" name="userId">
	账号：<input type="text" name="userName">
	密码：<input type="text" name="passWord">
	<input type="submit" value="提交">
	</form>
	</body>
	
controller使用：
	
	//	如何传递参数
	@RequestMapping(value="/add.do")
	public String add(UserInfo user,String passWord){
		System.out.println(user);
		return "useradd";
	}	
		
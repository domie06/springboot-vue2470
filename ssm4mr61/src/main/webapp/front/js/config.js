
var projectName = '课程辅助教学平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

]


var indexNav = [

{
	name: '课程',
	url: './pages/kecheng/list.html'
}, 
{
	name: '课程作业',
	url: './pages/kechengzuoye/list.html'
}, 
{
	name: '课程提问',
	url: './pages/kechengtiwen/list.html'
}, 
{
	name: '课程问卷',
	url: './pages/kechengwenjuan/list.html'
}, 
{
	name: '教研活动',
	url: './pages/jiaoyanhuodong/list.html'
}, 

{
	name: '论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '课程公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssm4mr61/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"老师","menuJump":"列表","tableName":"laoshi"}],"menu":"老师管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"课程","menuJump":"列表","tableName":"kecheng"}],"menu":"课程管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"课程作业","menuJump":"列表","tableName":"kechengzuoye"}],"menu":"课程作业管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"作业提交","menuJump":"列表","tableName":"zuoyetijiao"}],"menu":"作业提交管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"课程提问","menuJump":"列表","tableName":"kechengtiwen"}],"menu":"课程提问管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"课程回答","menuJump":"列表","tableName":"kechenghuida"}],"menu":"课程回答管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"课程问卷","menuJump":"列表","tableName":"kechengwenjuan"}],"menu":"课程问卷管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"问卷回答","menuJump":"列表","tableName":"wenjuanhuida"}],"menu":"问卷回答管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"教研活动","menuJump":"列表","tableName":"jiaoyanhuodong"}],"menu":"教研活动管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"课程公告","tableName":"news"},{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","提问问题","问卷调查"],"menu":"课程列表","menuJump":"列表","tableName":"kecheng"}],"menu":"课程模块"},{"child":[{"buttons":["查看","作业提交"],"menu":"课程作业列表","menuJump":"列表","tableName":"kechengzuoye"}],"menu":"课程作业模块"},{"child":[{"buttons":["查看","回答"],"menu":"课程提问列表","menuJump":"列表","tableName":"kechengtiwen"}],"menu":"课程提问模块"},{"child":[{"buttons":["查看","问卷回答"],"menu":"课程问卷列表","menuJump":"列表","tableName":"kechengwenjuan"}],"menu":"课程问卷模块"},{"child":[{"buttons":["查看"],"menu":"教研活动列表","menuJump":"列表","tableName":"jiaoyanhuodong"}],"menu":"教研活动模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","提问问题","问卷调查"],"menu":"课程","menuJump":"列表","tableName":"kecheng"}],"menu":"课程管理"},{"child":[{"buttons":["查看","作业提交"],"menu":"课程作业","menuJump":"列表","tableName":"kechengzuoye"}],"menu":"课程作业管理"},{"child":[{"buttons":["查看","删除"],"menu":"作业提交","menuJump":"列表","tableName":"zuoyetijiao"}],"menu":"作业提交管理"},{"child":[{"buttons":["查看","删除"],"menu":"课程提问","menuJump":"列表","tableName":"kechengtiwen"}],"menu":"课程提问管理"},{"child":[{"buttons":["查看"],"menu":"课程回答","menuJump":"列表","tableName":"kechenghuida"}],"menu":"课程回答管理"},{"child":[{"buttons":["查看","删除","问卷回答"],"menu":"课程问卷","menuJump":"列表","tableName":"kechengwenjuan"}],"menu":"课程问卷管理"},{"child":[{"buttons":["查看"],"menu":"问卷回答","menuJump":"列表","tableName":"wenjuanhuida"}],"menu":"问卷回答管理"},{"child":[{"buttons":["查看"],"menu":"教研活动","menuJump":"列表","tableName":"jiaoyanhuodong"}],"menu":"教研活动管理"}],"frontMenu":[{"child":[{"buttons":["查看","提问问题","问卷调查"],"menu":"课程列表","menuJump":"列表","tableName":"kecheng"}],"menu":"课程模块"},{"child":[{"buttons":["查看","作业提交"],"menu":"课程作业列表","menuJump":"列表","tableName":"kechengzuoye"}],"menu":"课程作业模块"},{"child":[{"buttons":["查看","回答"],"menu":"课程提问列表","menuJump":"列表","tableName":"kechengtiwen"}],"menu":"课程提问模块"},{"child":[{"buttons":["查看","问卷回答"],"menu":"课程问卷列表","menuJump":"列表","tableName":"kechengwenjuan"}],"menu":"课程问卷模块"},{"child":[{"buttons":["查看"],"menu":"教研活动列表","menuJump":"列表","tableName":"jiaoyanhuodong"}],"menu":"教研活动模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["查看","新增","发布作业","发布问卷","删除","修改"],"menu":"课程","menuJump":"列表","tableName":"kecheng"}],"menu":"课程管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"课程作业","menuJump":"列表","tableName":"kechengzuoye"}],"menu":"课程作业管理"},{"child":[{"buttons":["查看"],"menu":"作业提交","menuJump":"列表","tableName":"zuoyetijiao"}],"menu":"作业提交管理"},{"child":[{"buttons":["查看","回答"],"menu":"课程提问","menuJump":"列表","tableName":"kechengtiwen"}],"menu":"课程提问管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"课程回答","menuJump":"列表","tableName":"kechenghuida"}],"menu":"课程回答管理"},{"child":[{"buttons":["查看","删除"],"menu":"课程问卷","menuJump":"列表","tableName":"kechengwenjuan"}],"menu":"课程问卷管理"},{"child":[{"buttons":["查看"],"menu":"问卷回答","menuJump":"列表","tableName":"wenjuanhuida"}],"menu":"问卷回答管理"},{"child":[{"buttons":["查看","新增","删除"],"menu":"教研活动","menuJump":"列表","tableName":"jiaoyanhuodong"}],"menu":"教研活动管理"}],"frontMenu":[{"child":[{"buttons":["查看","提问问题","问卷调查"],"menu":"课程列表","menuJump":"列表","tableName":"kecheng"}],"menu":"课程模块"},{"child":[{"buttons":["查看","作业提交"],"menu":"课程作业列表","menuJump":"列表","tableName":"kechengzuoye"}],"menu":"课程作业模块"},{"child":[{"buttons":["查看","回答"],"menu":"课程提问列表","menuJump":"列表","tableName":"kechengtiwen"}],"menu":"课程提问模块"},{"child":[{"buttons":["查看","问卷回答"],"menu":"课程问卷列表","menuJump":"列表","tableName":"kechengwenjuan"}],"menu":"课程问卷模块"},{"child":[{"buttons":["查看"],"menu":"教研活动列表","menuJump":"列表","tableName":"jiaoyanhuodong"}],"menu":"教研活动模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"老师","tableName":"laoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

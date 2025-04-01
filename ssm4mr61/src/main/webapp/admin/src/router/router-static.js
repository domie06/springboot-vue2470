import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import kechengwenjuan from '@/views/modules/kechengwenjuan/list'
    import news from '@/views/modules/news/list'
    import jiaoyanhuodong from '@/views/modules/jiaoyanhuodong/list'
    import kechengzuoye from '@/views/modules/kechengzuoye/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import kechengtiwen from '@/views/modules/kechengtiwen/list'
    import kecheng from '@/views/modules/kecheng/list'
    import zuoyetijiao from '@/views/modules/zuoyetijiao/list'
    import laoshi from '@/views/modules/laoshi/list'
    import forum from '@/views/modules/forum/list'
    import kechenghuida from '@/views/modules/kechenghuida/list'
    import config from '@/views/modules/config/list'
    import wenjuanhuida from '@/views/modules/wenjuanhuida/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/kechengwenjuan',
        name: '课程问卷',
        component: kechengwenjuan
      }
      ,{
	path: '/news',
        name: '课程公告',
        component: news
      }
      ,{
	path: '/jiaoyanhuodong',
        name: '教研活动',
        component: jiaoyanhuodong
      }
      ,{
	path: '/kechengzuoye',
        name: '课程作业',
        component: kechengzuoye
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/kechengtiwen',
        name: '课程提问',
        component: kechengtiwen
      }
      ,{
	path: '/kecheng',
        name: '课程',
        component: kecheng
      }
      ,{
	path: '/zuoyetijiao',
        name: '作业提交',
        component: zuoyetijiao
      }
      ,{
	path: '/laoshi',
        name: '老师',
        component: laoshi
      }
      ,{
	path: '/forum',
        name: '论坛管理',
        component: forum
      }
      ,{
	path: '/kechenghuida',
        name: '课程回答',
        component: kechenghuida
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/wenjuanhuida',
        name: '问卷回答',
        component: wenjuanhuida
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;

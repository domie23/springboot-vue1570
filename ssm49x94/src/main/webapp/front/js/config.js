
var projectName = '共享充电宝管理系统';
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
]


var indexNav = [

{
	name: '合作商户',
	url: './pages/hezuoshanghu/list.html'
}, 
{
	name: '充电宝投放',
	url: './pages/chongdianbaotoufang/list.html'
}, 
{
	name: '公告栏',
	url: './pages/gonggaolan/list.html'
}, 

]

var adminurl =  "http://localhost:8080/ssm49x94/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"维护人员","menuJump":"列表","tableName":"weihurenyuan"}],"menu":"维护人员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"区域信息","menuJump":"列表","tableName":"quyuxinxi"}],"menu":"区域信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","投放"],"menu":"合作商户","menuJump":"列表","tableName":"hezuoshanghu"}],"menu":"合作商户管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"充电宝投放","menuJump":"列表","tableName":"chongdianbaotoufang"}],"menu":"充电宝投放管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"buttons":["删除","修改","查看"],"menu":"归还订单","menuJump":"列表","tableName":"guihaidingdan"}],"menu":"归还订单管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"费用订单","menuJump":"列表","tableName":"feiyongdingdan"}],"menu":"费用订单管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"充电宝维护","menuJump":"列表","tableName":"chongdianbaoweihu"}],"menu":"充电宝维护管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"公告栏","menuJump":"列表","tableName":"gonggaolan"}],"menu":"公告栏管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"合作商户列表","menuJump":"列表","tableName":"hezuoshanghu"}],"menu":"合作商户模块"},{"child":[{"buttons":["查看","租赁"],"menu":"充电宝投放列表","menuJump":"列表","tableName":"chongdianbaotoufang"}],"menu":"充电宝投放模块"},{"child":[{"buttons":["查看"],"menu":"公告栏列表","menuJump":"列表","tableName":"gonggaolan"}],"menu":"公告栏模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","归还"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"buttons":["查看"],"menu":"归还订单","menuJump":"列表","tableName":"guihaidingdan"}],"menu":"归还订单管理"},{"child":[{"buttons":["查看","支付"],"menu":"费用订单","menuJump":"列表","tableName":"feiyongdingdan"}],"menu":"费用订单管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"合作商户列表","menuJump":"列表","tableName":"hezuoshanghu"}],"menu":"合作商户模块"},{"child":[{"buttons":["查看","租赁"],"menu":"充电宝投放列表","menuJump":"列表","tableName":"chongdianbaotoufang"}],"menu":"充电宝投放模块"},{"child":[{"buttons":["查看"],"menu":"公告栏列表","menuJump":"列表","tableName":"gonggaolan"}],"menu":"公告栏模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["查看","维护登记"],"menu":"充电宝投放","menuJump":"列表","tableName":"chongdianbaotoufang"}],"menu":"充电宝投放管理"},{"child":[{"buttons":["查看"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"buttons":["查看","费用","审核"],"menu":"归还订单","menuJump":"列表","tableName":"guihaidingdan"}],"menu":"归还订单管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"费用订单","menuJump":"列表","tableName":"feiyongdingdan"}],"menu":"费用订单管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"充电宝维护","menuJump":"列表","tableName":"chongdianbaoweihu"}],"menu":"充电宝维护管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"合作商户列表","menuJump":"列表","tableName":"hezuoshanghu"}],"menu":"合作商户模块"},{"child":[{"buttons":["查看","租赁"],"menu":"充电宝投放列表","menuJump":"列表","tableName":"chongdianbaotoufang"}],"menu":"充电宝投放模块"},{"child":[{"buttons":["查看"],"menu":"公告栏列表","menuJump":"列表","tableName":"gonggaolan"}],"menu":"公告栏模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"维护人员","tableName":"weihurenyuan"}]


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

<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row>
                        <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="租赁编号" prop="zulinbianhao">
          <el-input v-model="ruleForm.zulinbianhao" 
              placeholder="租赁编号" clearable  :readonly="ro.zulinbianhao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="租赁编号" prop="zulinbianhao">
              <el-input v-model="ruleForm.zulinbianhao" 
                placeholder="租赁编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="充电宝编号" prop="chongdianbaobianhao">
          <el-input v-model="ruleForm.chongdianbaobianhao" 
              placeholder="充电宝编号" clearable  :readonly="ro.chongdianbaobianhao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="充电宝编号" prop="chongdianbaobianhao">
              <el-input v-model="ruleForm.chongdianbaobianhao" 
                placeholder="充电宝编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="区域" prop="quyu">
          <el-select v-model="ruleForm.quyu" placeholder="请选择区域">
            <el-option
                v-for="(item,index) in quyuOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="区域" prop="quyu">
	      <el-input v-model="ruleForm.quyu"
                placeholder="区域" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="24">  
        <el-form-item class="upload" v-if="type!='info' && !ro.tupian" label="图片" prop="tupian">
          <file-upload
          tip="点击上传图片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.tupian?ruleForm.tupian:''"
          @change="tupianUploadChange"
          ></file-upload>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.tupian" label="图片" prop="tupian">
            <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.tupian.split(',')" :src="item" width="100" height="100">
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="商户编号" prop="shanghubianhao">
          <el-input v-model="ruleForm.shanghubianhao" 
              placeholder="商户编号" clearable  :readonly="ro.shanghubianhao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="商户编号" prop="shanghubianhao">
              <el-input v-model="ruleForm.shanghubianhao" 
                placeholder="商户编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="商户名称" prop="shanghumingcheng">
          <el-input v-model="ruleForm.shanghumingcheng" 
              placeholder="商户名称" clearable  :readonly="ro.shanghumingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="商户名称" prop="shanghumingcheng">
              <el-input v-model="ruleForm.shanghumingcheng" 
                placeholder="商户名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="开始时间" prop="kaishishijian">
          <el-input v-model="ruleForm.kaishishijian" 
              placeholder="开始时间" clearable  :readonly="ro.kaishishijian"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="开始时间" prop="kaishishijian">
              <el-input v-model="ruleForm.kaishishijian" 
                placeholder="开始时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="结束时间" prop="jieshushijian">
          <el-input v-model="ruleForm.jieshushijian" 
              placeholder="结束时间" clearable  :readonly="ro.jieshushijian"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="结束时间" prop="jieshushijian">
              <el-input v-model="ruleForm.jieshushijian" 
                placeholder="结束时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="每小时费用" prop="meixiaoshifeiyong">
          <el-input v-model="ruleForm.meixiaoshifeiyong" 
              placeholder="每小时费用" clearable  :readonly="ro.meixiaoshifeiyong"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="每小时费用" prop="meixiaoshifeiyong">
              <el-input v-model="ruleForm.meixiaoshifeiyong" 
                placeholder="每小时费用" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="租赁时长" prop="zulinshizhang">
          <el-input v-model="ruleForm.zulinshizhang" 
              placeholder="租赁时长" clearable  :readonly="ro.zulinshizhang"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="租赁时长" prop="zulinshizhang">
              <el-input v-model="ruleForm.zulinshizhang" 
                placeholder="租赁时长" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="租赁费用" prop="zulinfeiyong">
            <el-input v-model="zulinfeiyong"
                placeholder="租赁费用" readonly></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.zulinfeiyong" label="租赁费用" prop="zulinfeiyong">
              <el-input v-model="ruleForm.zulinfeiyong" 
                placeholder="租赁费用" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="用户账号" prop="yonghuzhanghao">
          <el-input v-model="ruleForm.yonghuzhanghao" 
              placeholder="用户账号" clearable  :readonly="ro.yonghuzhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="用户账号" prop="yonghuzhanghao">
              <el-input v-model="ruleForm.yonghuzhanghao" 
                placeholder="用户账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="用户姓名" prop="yonghuxingming">
          <el-input v-model="ruleForm.yonghuxingming" 
              placeholder="用户姓名" clearable  :readonly="ro.yonghuxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="用户姓名" prop="yonghuxingming">
              <el-input v-model="ruleForm.yonghuxingming" 
                placeholder="用户姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="用户手机" prop="yonghushouji">
          <el-input v-model="ruleForm.yonghushouji" 
              placeholder="用户手机" clearable  :readonly="ro.yonghushouji"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="用户手机" prop="yonghushouji">
              <el-input v-model="ruleForm.yonghushouji" 
                placeholder="用户手机" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="人员账号" prop="renyuanzhanghao">
          <el-input v-model="ruleForm.renyuanzhanghao" 
              placeholder="人员账号" clearable  :readonly="ro.renyuanzhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="人员账号" prop="renyuanzhanghao">
              <el-input v-model="ruleForm.renyuanzhanghao" 
                placeholder="人员账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="人员姓名" prop="renyuanxingming">
          <el-input v-model="ruleForm.renyuanxingming" 
              placeholder="人员姓名" clearable  :readonly="ro.renyuanxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="人员姓名" prop="renyuanxingming">
              <el-input v-model="ruleForm.renyuanxingming" 
                placeholder="人员姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                                            </el-row>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              <el-form-item class="btn">
                <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    
    
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"#DCDFE6","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"4px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"#606266","addEditBoxColor":"#fff","dateIconFontSize":"14px","btnSaveBgColor":"rgba(36, 194, 205, 1)","uploadIconFontColor":"#8c939d","textareaBorderColor":"#DCDFE6","btnCancelBgColor":"#ecf5ff","selectLableColor":"#606266","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"#606266","dateBorderColor":"#DCDFE6","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"#606266","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"#606266","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"4px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"#606266","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"#DCDFE6","inputBorderColor":"#DCDFE6","uploadBorderColor":"#DCDFE6","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"1px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"#409EFF","btnSaveBorderWidth":"0px"},
      id: '',
      type: '',
      ro:{
	zulinbianhao : false,
	chongdianbaobianhao : false,
	quyu : false,
	tupian : false,
	shanghubianhao : false,
	shanghumingcheng : false,
	kaishishijian : false,
	jieshushijian : false,
	meixiaoshifeiyong : false,
	zulinshizhang : false,
	zulinfeiyong : false,
	yonghuzhanghao : false,
	yonghuxingming : false,
	yonghushouji : false,
	renyuanzhanghao : false,
	renyuanxingming : false,
	ispay : false,
      },
            ruleForm: {
                	        zulinbianhao: '',
	                        	        chongdianbaobianhao: '',
	                        	        quyu: '',
	                        	        tupian: '',
	                        	        shanghubianhao: '',
	                        	        shanghumingcheng: '',
	                        	        kaishishijian: '',
	                        	        jieshushijian: '',
	                        	        meixiaoshifeiyong: '',
	                        	        zulinshizhang: '',
	                        	        zulinfeiyong: '',
	                        	        yonghuzhanghao: '',
	                        	        yonghuxingming: '',
	                        	        yonghushouji: '',
	                        	        renyuanzhanghao: '',
	                        	        renyuanxingming: '',
	                        	                      },
                                                    quyuOptions: [],
                                                                                                                                                                                                                        rules: {
                  zulinbianhao: [
                                    	                                                              ],
                  chongdianbaobianhao: [
                                    	                                                              ],
                  quyu: [
                                    	                                                              ],
                  tupian: [
                                    	                                                              ],
                  shanghubianhao: [
                                    	                                                              ],
                  shanghumingcheng: [
                                    	                                                              ],
                  kaishishijian: [
                                    	                                                              ],
                  jieshushijian: [
                                    	                                                              ],
                  meixiaoshifeiyong: [
                                    	                                                              ],
                  zulinshizhang: [
                            { required: true, message: '租赁时长不能为空', trigger: 'blur' },
                                    	                                                              ],
                  zulinfeiyong: [
                                    	                                                              ],
                  yonghuzhanghao: [
                                    	                                                              ],
                  yonghuxingming: [
                                    	                                                              ],
                  yonghushouji: [
                                    	                                                              ],
                  renyuanzhanghao: [
                                    	                                                              ],
                  renyuanxingming: [
                                    	                                                              ],
                  ispay: [
                                    	                                                              ],
              }
    };
  },
  props: ["parent"],
  computed: {
                                                                                                                                    zulinfeiyong:{
                                                                                                                                                                                                                                                                          get: function () {
        return 1*this.ruleForm.meixiaoshifeiyong*this.ruleForm.zulinshizhang
      }
    },
                                                                                      },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
        // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          	            if(o=='zulinbianhao'){
            this.ruleForm.zulinbianhao = obj[o];
	    this.ro.zulinbianhao = true;
            continue;
          }
	            	            if(o=='chongdianbaobianhao'){
            this.ruleForm.chongdianbaobianhao = obj[o];
	    this.ro.chongdianbaobianhao = true;
            continue;
          }
	            	            if(o=='quyu'){
            this.ruleForm.quyu = obj[o];
	    this.ro.quyu = true;
            continue;
          }
	            	            if(o=='tupian'){
            this.ruleForm.tupian = obj[o];
	    this.ro.tupian = true;
            continue;
          }
	            	            if(o=='shanghubianhao'){
            this.ruleForm.shanghubianhao = obj[o];
	    this.ro.shanghubianhao = true;
            continue;
          }
	            	            if(o=='shanghumingcheng'){
            this.ruleForm.shanghumingcheng = obj[o];
	    this.ro.shanghumingcheng = true;
            continue;
          }
	            	            if(o=='kaishishijian'){
            this.ruleForm.kaishishijian = obj[o];
	    this.ro.kaishishijian = true;
            continue;
          }
	            	            if(o=='jieshushijian'){
            this.ruleForm.jieshushijian = obj[o];
	    this.ro.jieshushijian = true;
            continue;
          }
	            	            if(o=='meixiaoshifeiyong'){
            this.ruleForm.meixiaoshifeiyong = obj[o];
	    this.ro.meixiaoshifeiyong = true;
            continue;
          }
	            	            if(o=='zulinshizhang'){
            this.ruleForm.zulinshizhang = obj[o];
	    this.ro.zulinshizhang = true;
            continue;
          }
	            	            if(o=='zulinfeiyong'){
            this.ruleForm.zulinfeiyong = obj[o];
	    this.ro.zulinfeiyong = true;
            continue;
          }
	            	            if(o=='yonghuzhanghao'){
            this.ruleForm.yonghuzhanghao = obj[o];
	    this.ro.yonghuzhanghao = true;
            continue;
          }
	            	            if(o=='yonghuxingming'){
            this.ruleForm.yonghuxingming = obj[o];
	    this.ro.yonghuxingming = true;
            continue;
          }
	            	            if(o=='yonghushouji'){
            this.ruleForm.yonghushouji = obj[o];
	    this.ro.yonghushouji = true;
            continue;
          }
	            	            if(o=='renyuanzhanghao'){
            this.ruleForm.renyuanzhanghao = obj[o];
	    this.ro.renyuanzhanghao = true;
            continue;
          }
	            	            if(o=='renyuanxingming'){
            this.ruleForm.renyuanxingming = obj[o];
	    this.ro.renyuanxingming = true;
            continue;
          }
	            	                    }
                                                                                                                                                                                                                                                                                              }
            // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
                                                                                                                                                                                                                                                                                                                                          		if(json.renyuanzhanghao!=''&&json.renyuanzhanghao){
              		this.ruleForm.renyuanzhanghao = json.renyuanzhanghao
		}
                                  		if(json.renyuanxingming!=''&&json.renyuanxingming){
              		this.ruleForm.renyuanxingming = json.renyuanxingming
		}
                                                    } else {
          this.$message.error(data.msg);
        }
      });
                                                                              this.$http({
              url: `option/quyuxinxi/quyu`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.quyuOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
         
                                                                                                                                                                                                                                                                                        },
                                                                                                                                                // 多级联动参数
                                                                                                                                                                                      info(id) {
      this.$http({
        url: `feiyongdingdan/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },
        // 提交
    onSubmit() {
                  // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
              this.ruleForm.zulinfeiyong = this.zulinfeiyong
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                                                                                                                                                                                                                                                                                                                                                      this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `feiyongdingdan/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.feiyongdingdanCrossAddOrUpdateFlag = false;
                  this.parent.search();
                  this.parent.contentStyleChange();
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.feiyongdingdanCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
                                                            tupianUploadChange(fileUrls) {
                this.ruleForm.tupian = fileUrls;
				this.addEditUploadStyleChange()
            },
                                                                                                                                                                        	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
}
.btn .el-button {
  padding: 0;
}
</style>

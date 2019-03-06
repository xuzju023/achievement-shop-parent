<template>
  <div id="login">
    <el-form :model="loginForm" :rules="loginRules">
      <h2>DesireShop</h2>
      <el-form-item prop="username">
        <el-input v-model="loginForm.username"  placeholder="请输入用户名/手机号" auto-complete="on"></el-input>
      </el-form-item>

      <el-form-item>
        <el-input v-model="loginForm.password"  placeholder="请输入密码" auto-complete="on"></el-input>
      </el-form-item>

      <el-form-item>
        <el-button type="primary" @click="onSubmit">登录</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>


<script>
  import { postForm } from '@/utils/postForm'
  export default {
    name: "#login",
    data() {
      return {
        loginForm: {
          username: '',
          password: '',
        },
        loginRules: {
          username: [
            {
              required: true,

              message: "请输入用户名",

              trigger: "blur"
            }
          ],
          password: [
            {
              required: true,
              message: '请输入密码',
              trigger: 'blur'
            }
          ]
        }
      }
    },
    methods: {
      onSubmit() {
        /*this.$refs.loginForm.validate((valid) => {
          if(valid){
            loginReq(this.loginForm.username,this.loginForm.password).then((res) => {
              console.log(res.data.status);
            })
          }else{
            console.log('用户名或密码错误')
          }
        })*/
        postForm.post("http://localhost:8081/user/test",{
          userName: this.loginForm.username,
          passWord: this.loginForm.password
        }).then((res)=>{
          if(res.data.result=="true"){
            alert(res.data.result)
          }else {
            alert(res.data.result)
          }
        })

      }
    }
  };
</script>
<style scoped>
  .el-input {
    width: 300px;
  }
</style>

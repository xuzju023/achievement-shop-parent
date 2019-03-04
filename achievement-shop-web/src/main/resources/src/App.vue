<template>
  <div id="app">
    <Login></Login>
  </div>
</template>
<script>
  import Login from '@/components/Login'
  export default {
    name: 'App',
    components: {
      'Login': Login
    },
    data() {
      return {}
    }
  }
</script>
<style>
  #app {
    text-align: center;
    margin-top:400px ;
  }
</style>

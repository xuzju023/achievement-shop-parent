import { postForm } from '@/utils/postForm'

export  function loginReq(username,password) {
  return postForm.post('http://localhost:8081/user/test',{
    username: username,
    password: password
  })
}

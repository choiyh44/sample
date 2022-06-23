/**
 * 
 */
package kr.co.ensmart.sample.app.service;

/**
 * @startuml
 * participant "member-API" as api
 * api -> FE : 로그인 Request[loginId/password]
 * FE -> api : 로그인 Response[accessToken/refereshToken]
 * 
 * @enduml
 */
public class LoginSequence {

}

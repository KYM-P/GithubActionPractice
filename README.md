# GithubActionPractice

## 1️⃣ Auto pr label adder
<details>
  <summary> Team 과 Job 단위로 작성한 PR Title 을 통해 자동으로 PR 에 Tag 를 추가합니다. </summary>  
  <br>  
  
  | 예시 : [Campus][Feature] PR명 |
  |:--:|
  | <img alt="스크린샷 2025-11-17 140347" src="https://github.com/user-attachments/assets/d6aa4a4b-df82-48cb-8dbd-4d5b37743253" width=70% /> |
  | 결과 : campus, feature Tag 주입 |
  | <img alt="스크린샷 2025-11-17 140359" src="https://github.com/user-attachments/assets/e4c6e1df-f6e2-410d-ba0d-fca3c9e3888e" width=70% /> |
  
  ### 인식 가능 목록  
  > 대소문자 모두 대응
    
  각 Team 별 Tag (4종)  
  > [ USER | CAMPUS | BUSINESS | KOIN PROJECT ]  
  
  각 Job 별 Tag (4종)  
  > [ FEATURE | FIX or BUG | REFECTOR | CHORE ]  
</details>  

## 2️⃣ Auto pr label adder only team

<details>
  <summary> Team 단위로 작성한 PR Title 을 통해 자동으로 PR 에 Tag 를 추가합니다. </summary>  
  <br>  
  
  ### 인식 가능 목록  
  > 대소문자 모두 대응
    
  각 Team 별 Tag (4종)  
  > [ USER | CAMPUS | BUSINESS | KOIN PROJECT ]
</details>

## 3️⃣ Auto release note adder
<details>
  <summary> Release note 를 자동으로 생성합니다. </summary>  
  <br>  
  
  | [마지막 Release note 작성 시간 ~ 현재 시간] 까지의 모든 PR 에 Tag 를 분석해 분리하여 작성합니다. |
  |:--:|
  | <img width="50%" alt="스크린샷 2025-11-17 141930" src="https://github.com/user-attachments/assets/55cb0d93-4115-4f04-836c-32f1de943619" /> |  
  
  주의 : 인식 가능한 Tag 에 관하여 작성합니다. / 기간 사이의 모든 PR 에 대해 작성합니다.  
  > production 에 merged 된 PR body 에 v0.0.0 형식의 version code 가 존재하면 해당 version code 에 맞는 Tag 와 note title 을 지정합니다.
  ### 인식 Tag 목록  
  각 Team 별 Tag (4종)  
  > [ USER | CAMPUS | BUSINESS | KOIN PROJECT ]  
  
  각 Job 별 Tag (4종)  
  > [ FEATURE | BUG | REFECTOR | CHORE ]  
</details>  

## 4️⃣ Auto release note adder v2
<details>
  <summary> Release note 를 자동으로 생성합니다. (단 `production` branch 에 merged 된 PR 만 검사합니다.) </summary>  
  <br>  
  
  | [마지막 Release note 작성 시간 ~ 현재 시간] 까지 `production` branch 에 merged PR 에 Tag 를 분석해 분리하여 작성합니다. |
  |:--:|
  | 기간내의 PR 에서 production 에 merged 되지 않은 PR은 `not in production` Tag 가 붙습니다. |
  | `not in production` Tag 가 붙은 PR은 다음 실행에서 merged 되었는지 다시 검사합니다. |
  | <img width="70%" alt="스크린샷 2025-11-17 143601" src="https://github.com/user-attachments/assets/e8c761d3-8832-4bca-931d-67ec4dea61c9" /> |  
  
  주의 : PR 내부에 commit 수가 많아지면 하나로 압축된 하나의 commit 으로 처리하는 기능류(ex: squash)를 사용 시 추적이 불가능합니다.  
  > production 에 merged 된 PR body 에 v0.0.0 형식의 version code 가 존재하면 해당 version code 에 맞는 Tag 와 note title 을 지정합니다.
  ### 인식 Tag 목록  
  각 Team 별 Tag (4종)  
  > [ USER | CAMPUS | BUSINESS | KOIN PROJECT ]  
  
  각 Job 별 Tag (4종)  
  > [ FEATURE | BUG | REFECTOR | CHORE ]  
</details>  

## 5️⃣ Auto release note adder generate
<details>
  <summary> Release note 를 자동으로 생성합니다. (Github 에 generate option) </summary>  
  <br>  
  
  | Github 에 generate option 을 사용해 자동으로 작성힙니다. (production branch 기준) |
  |:--:|
  | <img width="50%" alt="스크린샷 2025-11-10 153220" src="https://github.com/user-attachments/assets/c1945c22-4ef7-4b14-9ec4-e5d3a0e969a5" /> |  
  
  주의 : PR 내부에 commit 수가 많아지면 하나로 압축된 하나의 commit 으로 처리하는 기능류(ex: squash)를 사용 시 추적이 불가능합니다.  
  > production branch 내부에 buildgradle.kts 파일이 존재해야 하며 그 내용으로 "versionName" field 를 통해 version code 를 가져옵니다.
  ### 인식 Tag 목록  
  각 Team 별 Tag (4종)  
  > [ USER | CAMPUS | BUSINESS | KOIN PROJECT ]  
  
  각 Job 별 Tag (4종)  
  > [ FEATURE | BUG | REFECTOR | CHORE ]  
</details>  

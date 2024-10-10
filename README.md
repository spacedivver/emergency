# 뉴집스

- - -
- 명령어는 git bash에서 실행

(주의사항 : backend는 master, fronted는 main)

- commit 후 PR, 내용 검토 후 master로 Merge
- commit 메시지 내용 규칙
  - feat : 새로운 기능에 대한 내용
  - fix : 버그 수정에 대한 내용
  - chore : 그 외 자잘한 수정 사항에 대한 내용<br/>
   ex) get commit -m "feat: 로그인 기능 구현"



### 🔖 Git 가이드 (참고)
1. 레포지토리 `fork`
2. `git clone`
   ````
    git clone {본인 Repo 주소}
   ````
3. 로컬 환경에서 <u>**기능 이름**</u>으로 브랜치 생성 후 작업
   ````
   git checkout -b {feature_name} // 로컬 브랜치 생성 후 생성한 브랜치로 이동
   예: 
   git checkout -b calendar
   ````
4. 작업 완료 후 `push`
   - git add . // 모든 작업 내용 스테이징<br/>
   - git commit -m '{commit_message}' // 커밋 메세지 작성 <br/>
   - git push origin {지금까지 작업한 브랜치 이름} // 원격 저장소에 작업 내용 push<br/>

5. `push` 후 웹페이지에서 <u>**Pull Request**</u> 작성
    - 원본 `repo:master`으로 PR 
    - 템플릿 맞춰서 작성: 주요 작업 사항 입력
6. `PR Merge` 후 원본 Repo의 새로운 커밋들을 본인 로컬 Repo로 `pull`
   
    6-1. 원본 Repo 주소 원격 등록 (처음 한 번만 수행)
    ````
    git remote add upstream https://github.com/newjips_Backend
    ````
    6-2. 본인 로컬 Repo로 `pull`
    ````
    git pull upstream master
    ````
    6-3. 본인 원격 Repo로 `push`
    ````
    git push origin {자기 브랜치 이름}
    ````

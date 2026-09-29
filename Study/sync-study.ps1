$ErrorActionPreference = 'Stop'

$repoRoot = Split-Path -Parent $PSScriptRoot
Set-Location $repoRoot

$changes = git status --porcelain -- Study
if (-not $changes) {
    Write-Host 'No Study changes to push.'
    exit 0
}

# 1. 깃허브의 최신 내용을 먼저 받아옴 (충돌 방지)
git pull origin main --rebase

# 2. Study 폴더의 새 파일, 수정 파일, 삭제 파일을 모두 추가
git add --all -- Study
$date = Get-Date -Format 'yyyy-MM-dd'
git commit -m "Study: $date"

# 3. 깃허브로 업로드
git push origin main
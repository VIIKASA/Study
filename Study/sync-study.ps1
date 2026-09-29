$ErrorActionPreference = 'Stop'

$repoRoot = Split-Path -Parent $PSScriptRoot
Set-Location $repoRoot

$changes = git status --porcelain -- Study
if (-not $changes) {
    Write-Host 'No Study changes to push.'
    exit 0
}

git add -- Study
$date = Get-Date -Format 'yyyy-MM-dd'
git commit -m "Study: $date"
git push origin main
# Trunk Based Development Demo

This project demonstrates trunk-based development practices using:
- Java/Maven
- Conventional Commits
- Semantic Versioning
- GitHub Actions for CI/CD

## Development Workflow

1. Clone the repository
2. Create a short-lived feature branch
3. Make changes following conventional commits:
   - `feat:` for new features
   - `fix:` for bug fixes
   - `BREAKING CHANGE:` for breaking changes
4. Create a Pull Request to main
5. Merge after CI passes

## Build and Test

```bash
mvn clean install
```

## Versioning

Semantic versioning is automated based on conventional commits:
- BREAKING CHANGE: -> Major version bump
- feat: -> Minor version bump
- fix: -> Patch version bump

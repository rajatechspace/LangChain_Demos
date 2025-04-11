# Hello API

A simple REST API built with Django and Django REST Framework that returns a "Hello, World!" message.

## Features

- Simple GET endpoint that returns a JSON response
- Built with Django 5.2 and Django REST Framework
- Browsable API interface

## Setup

### Prerequisites

- Python 3.x
- pip (Python package manager)

### Installation

1. Clone the repository:
```
git clone <repository-url>
cd hello_api
```

2. Install dependencies:
```
pip3 install django djangorestframework
```

3. Run migrations:
```
python3 manage.py migrate
```

4. Start the development server:
```
python3 manage.py runserver
```

The API will be available at http://127.0.0.1:8000/

## API Endpoints

### Hello World

- URL: `/api/hello/`
- Method: `GET`
- Response:
```json
{
    "message": "Hello, World!"
}
```

## Project Structure

```
hello_api/
├── api/                  # API application
│   ├── migrations/       # Database migrations
│   ├── urls.py           # API URL patterns
│   └── views.py          # API views
├── hello_api/            # Main project directory
│   ├── settings.py       # Project settings
│   └── urls.py           # Main URL configuration
├── manage.py             # Django management script
└── README.md             # This file
```

## Development

To make changes to the API:

1. Edit the views in `api/views.py`
2. Add new endpoints in `api/urls.py`
3. Include new apps in `hello_api/settings.py`

## License

This project is open source and available under the [MIT License](LICENSE). 
from django.shortcuts import render
from rest_framework.views import APIView
from rest_framework.response import Response
from rest_framework import status

# Create your views here.

class HelloWorldView(APIView):
    """
    A simple API view that returns Hello World
    """
    def get(self, request, *args, **kwargs):
        return Response({'message': 'Hello, World!'}, status=status.HTTP_200_OK)
